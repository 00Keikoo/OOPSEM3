--Bagian 1--

1a. Kelas PasswordReminder error saat manggil dbConnection.connect("jdbc:mysql://localhost/prod_db"); karena method connect() sekarang butuh dua parameter, sedangkan PasswordReminder masih memanggil 1 parameeter.

1b. kode List<String> usersToRemind = dbConnection.execureQuery("SELECT ..."); akan error karena return type sudah beda jadi harus diubah menjadi String[] usersToRemind = dbConnection.executeQuery("SELECT ...");

2a. this.dbConnection = new MySQLConnection(); Karena di sini PasswordReminder membuat langsung objek MySQLConnection. Akibatnya kelas ini tahu detail konkret database(MySQL) dan tidak bisa diganti ke Postgres atau lainnya tanpa ubah kode.

2b. Karena PasswordReminder selalu membuat koneksi MySQL sungguhan saat dijalankan, jadi sulit untuk di tes tanpa database sungguhan.

--Bagian 2A--
1. Kelas SimulatedConnection digunakan untuk pengujian atau development mode tanpa database asli
2. Ini berguna saat unit testing agar kita bisa mengetes logika aplikasi tanpa tergantung koneksi nyata.

--Bagian 2B--
1. Ya itu masih sedikit code smell karena PasswordReminder masih tahu detail connection string. dimana dia tahu konfigurasi yang harusnya tanggung jawab bagian lain
2. Solusi: Dependency Injection juga untuk connectionString, contoh lewat constructor, konfigurasi file .env atau factory class yang menyiapkan koneksi.

--Bagian 3--
2. Keuntungan dependency lewat constructor: 
    -lebih fleksibel
    -lebih mudah dites
    -lebih sesuai dengan prinsip DIP
3. Diagram menunjukkan PasswordReminder bergantung pada DBConnectionInterface. Di main kita bisa ganti koneksi MySQL <-> PostgreSQL <-> simulasi tanpa ubah PasswordReinder. Ini membuktikan panah dependensi di diagram benar" terwujud
