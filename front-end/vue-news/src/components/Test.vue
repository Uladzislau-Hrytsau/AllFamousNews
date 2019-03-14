<template>
    <div class="container col-12 mt-3">

        <!--<div class="container col-8 border-bottom border-dark">-->
        <!--<mdb-row class="m-3">-->
        <!--<mdb-btn-group>-->
        <!--<mdb-btn outline="mdb-color" rounded>all</mdb-btn>-->
        <!--<mdb-btn v-for="value in values" outline="mdb-color" v-text="value" :key="value" rounded></mdb-btn>-->
        <!--</mdb-btn-group>-->
        <!--</mdb-row>-->
        <!--</div>-->

        <!--<div class="container col-8 border-bottom border-dark">-->
        <!--<div class="row align-items-center">-->
        <!--<div class="col-6">-->
        <!--<mdb-btn class="col-12 btn btn-outline-black waves-effect">add folder</mdb-btn>-->
        <!--</div>-->
        <!--<div class="col-6">-->
        <!--<mdb-btn class="col-12 btn btn-outline-black waves-effect">add file</mdb-btn>-->
        <!--</div>-->
        <!--</div>-->
        <!--</div>-->

        <div class="container col-12 mt-3">
            <mdb-container>
                <mdb-row>
                    <div class="card testimonial-ca rd autocomplete" v-for="value in values" :key="value.title">
                        <div class="card-body">
                            <div>
                                <button class="btn fas fa-info animated tada infinite"></button>
                                <button class="btn far fa-edit animated tada infinite"></button>
                                <button class="btn far fa-trash-alt animated tada infinite">
                                    <!--<i class="far fa-trash-alt"></i>-->
                                    <!--<i class="far fa-edit"></i>-->
                                </button>
                            </div>
                            <div class="mt-2">
                                <h4 class="far fa-folder fa-5x"></h4>
                                <h4 class=" mt-2 card-title" v-text="value.title"></h4>
                            </div>
                        </div>
                    </div>
                </mdb-row>
            </mdb-container>
        </div>

    </div>
</template>

<script>
    import 'bootstrap-css-only/css/bootstrap.min.css';
    import 'mdbvue/build/css/mdb.css';
    import 'vue-material/dist/vue-material.min.css'
    import {
        mdbContainer,
        mdbRow,
    } from 'mdbvue';

    export default {
        name: "Test",

        components: {
            mdbContainer,
            mdbRow,
        },

        data() {
            return {
                values: []
            }
        },

        methods: {
          displayStructure() {
              this.$store.dispatch('displayStructure')
                  .then(response => {
                      this.values = response.data
                  })
          }
        },

        mounted() {
            this.displayStructure();
        }
    }
</script>

<style scoped>

</style>