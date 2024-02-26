SELECT penerbit_nama
FROM penerbit
WHERE penerbit_id = (
    SELECT penerbit_penerbit_id
    FROM buku
    GROUP BY penerbit_penerbit_id
    ORDER BY COUNT(*) DESC
    LIMIT 1
);

select m.mhs_id, m.mhs_nama, j.jur_nama, count(p.mahasiswa_mhs_id) AS jumlah_transaksi from mahasiswa m join prodi r on m.prodi_prodi_kode = r.prodi_kode join jurusan j on r.jurusan_jur_kode = j.jur_kode join peminjaman p on p.mahasiswa_mhs_id = m.mhs_id group by m.mhs_id, m.mhs_nama, j.jur_nama;