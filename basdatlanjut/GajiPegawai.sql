CREATE TABLE departemen (
    id_departemen SERIAL PRIMARY KEY,
    nama_departemen VARCHAR(100) NOT NULL,
    lokasi VARCHAR(100)
);

CREATE TABLE jabatan (
    id_jabatan SERIAL PRIMARY KEY,
    nama_jabatan VARCHAR(100) NOT NULL,
    gaji_pokok NUMERIC(15,2) NOT NULL,
    tunjangan NUMERIC(15,2) DEFAULT 0
);

CREATE TABLE pegawai (
    id_pegawai SERIAL PRIMARY KEY,
    nama VARCHAR(100) NOT NULL,
    alamat VARCHAR(150),
    no_telp VARCHAR(20),
    tgl_masuk DATE,
    id_jabatan INT REFERENCES jabatan(id_jabatan),
    id_departemen INT REFERENCES departemen(id_departemen)
);

CREATE TABLE absensi (
    id_absensi SERIAL PRIMARY KEY,
    id_pegawai INT REFERENCES pegawai(id_pegawai),
    tanggal DATE,
    status VARCHAR(10) CHECK (status IN ('Hadir', 'Izin', 'Sakit', 'Alpha')) DEFAULT 'Hadir',
    jam_masuk TIME,
    jam_keluar TIME
);

CREATE TABLE penggajian (
    id_penggajian SERIAL PRIMARY KEY,
    id_pegawai INT REFERENCES pegawai(id_pegawai),
    periode VARCHAR(20),
    total_hadir INT,
    potongan NUMERIC(15,2) DEFAULT 0,
    total_gaji NUMERIC(15,2),
    tgl_pembayaran DATE
);

INSERT INTO departemen (nama_departemen, lokasi) VALUES
('HRD', 'Surabaya'),
('IT', 'Jakarta'),
('Keuangan', 'Bandung');

INSERT INTO jabatan (nama_jabatan, gaji_pokok, tunjangan) VALUES
('Manager', 10000000, 2000000),
('Staff', 5000000, 1000000),
('Admin', 4000000, 500000);

INSERT INTO pegawai (nama, alamat, no_telp, tgl_masuk, id_jabatan, id_departemen) VALUES
('Andi', 'Jl. Merpati No.1', '081234567890', '2021-03-01', 1, 1),
('Budi', 'Jl. Kenari No.2', '081234567891', '2022-01-10', 2, 2),
('Citra', 'Jl. Cendrawasih No.3', '081234567892', '2023-07-15', 3, 3);

INSERT INTO absensi (id_pegawai, tanggal, status, jam_masuk, jam_keluar) VALUES
(1, '2025-11-01', 'Hadir', '08:00', '16:00'),
(1, '2025-11-02', 'Hadir', '08:05', '16:10'),
(2, '2025-11-01', 'Izin', NULL, NULL),
(3, '2025-11-01', 'Hadir', '08:00', '16:00');
