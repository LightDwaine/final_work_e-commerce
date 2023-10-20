<%-- 
    Document   : index
    Created on : 1 de set de 2023, 14:52:02
    Author     : Leonardo Oliveira Moreira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="style/index.css">
        <script src="js/index.js" defer></script>
        <title>Página Inicial</title>
    </head>
    <body>
        <header class="header">
            <nav>
                <div class="logo">
                    <a class="home-button" href="index.jsp"><img src="logo.png" alt="LOGO"></a>
                </div>

                <div class="search-bar">
                    <input type="text" class="search" >
                </div>

                <div class="login">
                    <a class="login-button" href="login.jsp">LOGIN</a>
                </div>

                <div class="cart-market">
                    <a class="cart-button" href="carrinho.jsp"><img class="cart-img" src="img/cart.png" alt="CART"></a>
                </div>
            </nav>
        </header>
        <section class="slider">
            <div class="slider-content">

                <input type="radio" name="btn-radio" id="radio1">
                <input type="radio" name="btn-radio" id="radio2">
                <input type="radio" name="btn-radio" id="radio3">

                <div class="slide-box primeiro">
                    <img src="img/slide1.jpg" alt="slide 1" /> 
                </div>

                <div class="slide-box">
                    <img src="img/slide2.jpg" alt="slide 2" >
                </div>

                <div class="slide-box">
                    <img src="img/slide3.jpg" alt="slide 3" >
                </div>

                <div class="nav-auto">
                    <div class="auto-btn1"></div>
                    <div class="auto-btn2"></div>
                    <div class="auto-btn3"></div>
                </div>

                <div class="nav-manual">
                    <label for="radio1" class="manual-btn"></label>
                    <label for="radio2" class="manual-btn"></label>
                    <label for="radio3" class="manual-btn"></label>
                </div>

            </div>
        </section>
        <section class="catalogo">
            <div class="item">
                <a href="#">
                    <img src="img/item1.jpg" alt="Produto 1">
                    <p class="preco">R$ 50,00</p>
                    <p class="estoque">Em estoque: 10 unidades</p>
                </a>
            </div>

            <div class="item">
                <a href="#">
                    <img src="img/item2.jpg" alt="Produto 2">
                    <p class="preco">R$ 35,00</p>
                    <p class="estoque">Em estoque: 5 unidades</p>
                </a>
            </div>

            <div class="item">
                <a href="#">
                    <img src="img/item3.png" alt="Produto 3">
                    <p class="preco">R$ 75,00</p>
                    <p class="estoque">Em estoque: 15 unidades</p>
                </a>
            </div>
        </section>
    </body>
</html>
