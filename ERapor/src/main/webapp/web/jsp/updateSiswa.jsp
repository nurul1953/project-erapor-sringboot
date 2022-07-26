<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Insert Siswa</title>
    <link href="css/styles.css" rel="stylesheet" />
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous"></script>
</head>
<body class="bg-primary">
<div id="layoutAuthentication">
    <div id="layoutAuthentication_content">
        <main>
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-lg-7">
                        <div class="card shadow-lg border-0 rounded-lg mt-5">
                            <div class="card-header"><h3 class="text-center font-weight-light my-4">Update Data Siswa</h3></div>
                            <div class="card-body">
                                <form:form id="ssw" action="/saveUpdateSiswa" modelAttribute="siswaDto" method="POST">
                                    <form:hidden path="nis" value="${siswaDto.nis}" />
                                    <div class="form-floating mb-3">
                                        <form:input class="form-control" path="nama" type="text" placeholder="Masukkan Nama Siswa" value="${siswaDto.nama}"/>
                                        <label for="nama">Nama</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <form:select class="form-control" path="kelas"  value="${siswaDto.kelas}">
                                            <form:option value="1"/>
                                            <form:option value="2"/>
                                            <form:option value="3"/>
                                            <form:option value="4"/>
                                            <form:option value="5"/>
                                            <form:option value="6"/>
                                        </form:select><label for="kelas">Kelas</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <form:input class="form-control" path="tgl_lahir" type="date" placeholder="Masukkan Tgl Lahir"  value="${siswaDto.tgl_lahir}"/>
                                        <label for="tgl_lahir">Tanggal Lahir</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <form:select class="form-control" path="jk" value="${siswaDto.jk}">
                                            <form:option value="Laki-laki"/>
                                            <form:option value="Perempuan"/>
                                        </form:select><label for="jk">Jenis Kelamin</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <form:input class="form-control" path="alamat" type="text" placeholder="Masukkan Alamat" value="${siswaDto.alamat}"/>
                                        <label for="alamat">Alamat</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <form:input class="form-control" path="agama" type="text" placeholder="Masukkan Agama" value="${siswaDto.agama}"/>
                                        <label for="agama">Agama</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <form:input class="form-control" path="nama_ayah" type="text" placeholder="Masukkan Nama Ayah" value="${siswaDto.nama_ayah}"/>
                                        <label for="nama_ayah">Nama Ayah</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <form:input class="form-control" path="nama_ibu" type="text" placeholder="Masukkan Nama Ibu" value="${siswaDto.nama_ibu}"/>
                                        <label for="nama_ibu">Nama Ibu</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <form:input class="form-control" path="pekerjaan_ayah" type="text" placeholder="Masukkan Pekerjaan Ayah" value="${siswaDto.pekerjaan_ayah}"/>
                                        <label for="pekerjaan_ayah">Pekerjaan Ayah</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <form:input class="form-control" path="pekerjaan_ibu" type="text" placeholder="Masukkan Pekerjaan Ibu" value="${siswaDto.pekerjaan_ibu}"/>
                                        <label for="pekerjaan_ibu">Pekerjaan Ibu</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <form:input class="form-control" path="alamat_ayah" type="text" placeholder="Masukkan Alamat Ayah" value="${siswaDto.alamat_ayah}"/>
                                        <label for="alamat_ayah">Alamat Ayah</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <form:input class="form-control" path="alamat_ibu" type="text" placeholder="Masukkan Alamat Ibu" value="${siswaDto.alamat_ibu}"/>
                                        <label for="alamat_ibu">Alamat Ibu</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <form:input class="form-control" path="nama_wali" type="text" placeholder="Masukkan Nama Wali" value="${siswaDto.nama_wali}"/>
                                        <label for="nama_wali">Nama Wali</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <form:input class="form-control" path="pekerjaan_wali" type="text" placeholder="Masukkan Pekerjaan Wali" value="${siswaDto.pekerjaan_wali}"/>
                                        <label for="pekerjaan_wali">Pekerjaan Wali</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <form:input class="form-control" path="alamat_wali" type="text" placeholder="Masukkan Alamat Wali" value="${siswaDto.alamat_wali}"/>
                                        <label for="alamat_wali">Alamat Wali</label>
                                    </div>
                                    <div class="mt-4 mb-0">
                                        <div class="d-grid">
                                            <form:button class="btn btn-primary btn-block" type="submit" id="save">Simpan Data</form:button>
                                        </div>
                                    </div>
                                </form:form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
    </div>
    <div id="layoutAuthentication_footer">
        <footer class="py-4 bg-light mt-auto">
            <div class="container-fluid px-4">
                <div class="d-flex align-items-center justify-content-between small">
                    <div class="text-muted">Copyright &copy; Nushrotummillah 2022</div>
                    <div>
                        <a href="#">Privacy Policy</a>
                        &middot;
                        <a href="#">Terms &amp; Conditions</a>
                    </div>
                </div>
            </div>
        </footer>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
<script src="js/scripts.js"></script>
</body>
</html>