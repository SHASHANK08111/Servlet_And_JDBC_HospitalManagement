<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <%@include file="../components/allcss.jsp"%> 
    <link rel="stylesheet" href="../components/navbar.css">
</head>
<body>
    <%@include file="../components/navbar.jsp"%> 
    <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
                <div class="carousel-indicators">
                  <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                  <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
                  <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
                </div>
                <div class="carousel-inner">
                  <div class="carousel-item active">
                    <img src="../img/Hm3.jpg" class="d-block w-100" alt="..."height = "600px">
                  </div>
                  <div class="carousel-item">
                    <img src="../img/Hm1.jpg" class="d-block w-100" alt="..." height = "600px">
                  </div>
                  <div class="carousel-item">
                    <img src="../img/Hm2.jpg" class="d-block w-100" alt="..." height = "600px">
                  </div>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
                  <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                  <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
                  <span class="carousel-control-next-icon" aria-hidden="true"></span>
                  <span class="visually-hidden">Next</span>
                </button>
              </div>
              <div class="container p-3">
                  <p class="text-center fs-2">Key Features of our Hospital</p>
                  <div class="row">
                      <div class="col-md-8">
                          <div class="row">
                              <div class="col-md-6">
                                  <div class="card border-0 shadow-sm mb-4">
                                      <div class="card-body">
                                          <h5 class="card-title fs-s mb-3">100% Safety</h5>
                                          <p class="card-text fs-s">Our hospital prioritizes the safety and well-being of every patient through rigorous safety protocols and measures.</p>
                                      </div>
                                  </div>
                              </div>
                              <div class="col-md-6">
                                  <div class="card border-0 shadow-sm mb-4">
                                      <div class="card-body">
                                          <h5 class="card-title fs-s mb-3">100% Safety</h5>
                                          <p class="card-text fs-s">Our hospital prioritizes the safety and well-being of every patient through rigorous safety protocols and measures.</p>
                                      </div>
                                  </div>
                              </div>
                              <div class="col-md-6">
                                  <div class="card border-0 shadow-sm mb-4">
                                      <div class="card-body">
                                          <h5 class="card-title fs-s mb-3">100% Safety</h5>
                                          <p class="card-text fs-s">Our hospital prioritizes the safety and well-being of every patient through rigorous safety protocols and measures.</p>
                                      </div>
                                  </div>
                              </div>
                              <div class="col-md-6">
                                  <div class="card border-0 shadow-sm mb-4">
                                      <div class="card-body">
                                          <h5 class="card-title fs-s mb-3">100% Safety</h5>
                                          <p class="card-text fs-s">Our hospital prioritizes the safety and well-being of every patient through rigorous safety protocols and measures.</p>
                                      </div>
                                  </div>
                              </div>
                          </div>
                      </div>
                      <div class="col-md-4">
                       <div class="row justify-content-center align-items-center" style="height: 50%">
                           <div style="max-height: 100%; max-width: 100%">
                               <img src="../img/doc2.jpg" class="img-fluid" alt="">
                           </div>
                       </div>
                   </div>
                  </div>
              </div>
</body>
</html>