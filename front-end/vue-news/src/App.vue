<template>
    <div id="app">
        <Header></Header>
        <main class="container-fluid">
            <Body></Body>
        </main>
        <Footer></Footer>
    </div>
</template>

<script>
    import 'bootstrap-css-only/css/bootstrap.min.css';
    import 'mdbvue/build/css/mdb.css';
    import Header from './components/Header';
    import Body from './components/Body';
    import Footer from './components/Footer';

    export default {
        name: 'app',
        components: {
            Footer,
            Header,
            Body
        },
    }
</script>

<style>
    #app {
        height: 100%;
        margin: 0;
    }
    .container-fluid {
        width: 100%;
        padding-right: 15px;
        padding-left: 15px;
        margin-right: auto;
        margin-left: auto;
    }
</style>
