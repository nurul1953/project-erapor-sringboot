<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Update Sekolah</title>
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
                            <div class="card-header"><h3 class="text-center font-weight-light my-4">Update Data Sekolah</h3></div>
                            <div class="card-body">
                                <form:form id="sklh" action="/saveSekolah" modelAttribute="sekolahDto" method="POST" enctype="multipart/form-data">
                                    <form:hidden path="npsn" value="${sekolahDto.npsn}" />
                                    <div class="form-floating mb-3">
                                        <form:input class="form-control" path="nama" type="text" placeholder="Masukan Nama Sekolah" value="${sekolahDto.nama}"/>
                                        <label for="nama">Nama Sekolah</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <form:input class="form-control" path="alamat" type="text" placeholder="Masukan Alamat" value="${sekolahDto.alamat}"/>
                                        <label for="alamat">Alamat</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <form:select class="form-control" path="provinsi" value="${sekolahDto.provinsi}">
                                            <form:option value="Aceh"/>
                                            <form:option value="Sumatera Utara"/>
                                            <form:option value="Sumatera Barat"/>
                                            <form:option value="Riau"/>
                                            <form:option value="Jambi"/>
                                            <form:option value="Sumatera Selatan"/>
                                            <form:option value="Bengkulu"/>
                                            <form:option value="Lampung"/>
                                            <form:option value="Kepulauan Bangka Belitung"/>
                                            <form:option value="Kepulauan Riau"/>
                                            <form:option value="DKI Jakarta"/>
                                            <form:option value="Jawa Barat"/>
                                            <form:option value="Jawa Tengah"/>
                                            <form:option value="DI Yogyakarta"/>
                                            <form:option value="Jawa Timur"/>
                                            <form:option value="Banten"/>
                                            <form:option value="Bali"/>
                                            <form:option value="Nusa Tenggara Barat"/>
                                            <form:option value="Nusa Tenggara Timur"/>
                                            <form:option value="Kalimantan Barat"/>
                                            <form:option value="Kalimantan Tengah"/>
                                            <form:option value="Kalimantan Selatan"/>
                                            <form:option value="Kalimantan Timur"/>
                                            <form:option value="Kalimantan Utara"/>
                                            <form:option value="Sulawesi Utara"/>
                                            <form:option value="Sulawesi Tengah"/>
                                            <form:option value="Sulawesi Selatan"/>
                                            <form:option value="Sulawesi Tenggara"/>
                                            <form:option value="Gorontalo"/>
                                            <form:option value="Sulawesi Barat"/>
                                            <form:option value="Maluku"/>
                                            <form:option value="Maluku Utara"/>
                                            <form:option value="Papua"/>
                                            <form:option value="Papua Barat"/>
                                        </form:select>
                                        <label for="Provinsi">Provinsi</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <form:input class="form-control" path="web" type="text" placeholder="Masukan Website Sekolah"  value="${sekolahDto.web}"/>
                                        <label for="web">Website</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <form:input class="form-control" path="email" type="text" placeholder="Masukan Email (example@gmail.com)"  value="${sekolahDto.email}"/>
                                        <label for="email">E-Mail</label>
                                    </div>
                                    <div class="form-floating mb-3">
                                        <input type="file" name="fileimage">
                                    </div>
                                    <div class="mt-4 mb-0">
                                        <div class="d-grid">
                                            <form:button class="btn btn-primary btn-block" type="submit" id="save">Update Data Sekolah</form:button>
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
