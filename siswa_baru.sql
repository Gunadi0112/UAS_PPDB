-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 14 Jan 2023 pada 11.37
-- Versi Server: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `siswa_baru`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `akun`
--

CREATE TABLE IF NOT EXISTS `akun` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama` varchar(50) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `role` enum('Admin','Petugas') NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=15 ;

--
-- Dumping data untuk tabel `akun`
--

INSERT INTO `akun` (`id`, `nama`, `username`, `password`, `role`) VALUES
(3, 'Ahmad Gunadi', 'gunadi', 'gunadi', 'Petugas'),
(5, 'AhmadGunadi', 'gunadiadmin', 'gunadiadmin', 'Admin'),
(9, 'fauzan02', 'fauzan', 'fauzan', 'Petugas'),
(10, 'Insan', 'insan1', 'insan1', 'Petugas'),
(11, 'Rahul', 'rahul122', 'Rahul122', 'Petugas'),
(12, 'Samsul Anwar', 'SAMSUL11', 'SAMSUL11', 'Petugas'),
(13, ' Sandi', 'Sandi1', 'Sandi1', 'Petugas'),
(14, 'Sinta', 'SINTA12', 'SINTA12', 'Admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE IF NOT EXISTS `barang` (
  `id_barang` int(11) NOT NULL AUTO_INCREMENT,
  `nama_barang` varchar(40) NOT NULL,
  `jumlah` varchar(50) NOT NULL,
  `tanggal` varchar(40) NOT NULL,
  PRIMARY KEY (`id_barang`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`id_barang`, `nama_barang`, `jumlah`, `tanggal`) VALUES
(1, 'LCD', '10', '15 JANUARI 2023'),
(2, 'Kipas Angin', '30', '02, Maret 2019'),
(3, 'Komputer', '20', '14 Maret 2020'),
(4, 'Laptop', '23', '22 September 2022');

-- --------------------------------------------------------

--
-- Struktur dari tabel `guru`
--

CREATE TABLE IF NOT EXISTS `guru` (
  `id_guru` int(11) NOT NULL AUTO_INCREMENT,
  `nama` varchar(50) NOT NULL,
  `alamat_guru` varchar(100) NOT NULL,
  `mata_pelajaran` varchar(50) NOT NULL,
  PRIMARY KEY (`id_guru`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data untuk tabel `guru`
--

INSERT INTO `guru` (`id_guru`, `nama`, `alamat_guru`, `mata_pelajaran`) VALUES
(1, 'Ahmad Gunadi', 'Banjarbaru', 'Tik'),
(2, 'Salahuddin', 'Barabai, jl.pramuka', 'Matematika'),
(3, 'Shopia Darlia', 'Barabai darat', 'Bahasa Indonesia'),
(4, 'Dilli', 'Barabai darat', 'Fhoto Shoot'),
(5, 'Zarkawi Soyuti', 'Barabai', 'Html,Css,Php'),
(6, 'Ningsih', 'Aluan Mati', 'Bahasa Inggris');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_siswa`
--

CREATE TABLE IF NOT EXISTS `tb_siswa` (
  `no_pendaftaran` int(11) NOT NULL AUTO_INCREMENT,
  `nisn` int(11) NOT NULL,
  `nama_lengkap` varchar(50) NOT NULL,
  `kelamin` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `tempat_tgl_lahir` varchar(255) NOT NULL,
  `asal_sekolah` varchar(255) NOT NULL,
  `tahun_lulusan` varchar(20) NOT NULL,
  PRIMARY KEY (`no_pendaftaran`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=44 ;

--
-- Dumping data untuk tabel `tb_siswa`
--

INSERT INTO `tb_siswa` (`no_pendaftaran`, `nisn`, `nama_lengkap`, `kelamin`, `alamat`, `tempat_tgl_lahir`, `asal_sekolah`, `tahun_lulusan`) VALUES
(36, 2010010102, 'Ahmad Gunadi', 'Laki-laki', 'Ds.tilahan Kec.Hantakan', 'Banjarmasin, 12 Agustus 2001', 'MTS NUR HIDAYAH', '2017'),
(37, 2010010145, 'Adul Kadir', 'Laki-laki', 'Barabai Hst', 'Barabai, 02 Januari 2002 ', 'SMP 2 HST', '2017'),
(38, 2010010232, 'Mahmudin', 'Laki-laki', 'Kalua, timur ', 'Kalua, 16 April 2001', 'SMP 3 KALUA', '2017'),
(39, 2010010103, 'Udin', 'Laki-laki', 'Banjarmasin,.....', 'Banjarmasin, 22 November 2003', 'SMP 1 BANJARMASIN', '2017'),
(40, 2010010104, 'Mahmud', 'Laki-laki', 'Kaandanga,....', 'Kandangan, 16 April 2001', 'SMPN 2 KANDANGAN', '2017'),
(41, 20133, 'Sandi', 'Laki-laki', 'BARABAI,', 'Barabai, 27 Januari 2002', 'SMP 1 BARABAI', '2017'),
(42, 2010101020, 'Shinta', 'Perempuan', 'NAGARA', 'Nagara, 30 Agustus 2002', 'SMP NEGERI 4 NAGARA', '2017');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
