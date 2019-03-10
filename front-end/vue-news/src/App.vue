<template>
    <div id="app">
        <Test v-for="count in counts" v-bind:key="count"></Test>
    </div>
</template>

<script>
    import Test from './components/Test'

    export default {
        name: 'app',

        data() {
            return {
                counts: [1,2],
            }
        },

        components: {
            Test,
        }
    }
</script>

<style>

</style>
