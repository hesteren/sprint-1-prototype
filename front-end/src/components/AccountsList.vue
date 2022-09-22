<template>
  <!-- <div class="listframe"> -->
    <h1>List component</h1>
      <div v-for="item in array">
        <Account :account="item"></Account>
      </div>
  <!-- </div> -->


</template>

<script>
import Account from "./Account.vue";
    export default {
    name: "List",
    props: {
        array: Array
    },
    components: { Account },
}


</script>

<style scoped>
  .listframe {
    display: flex;
    min-height: 50vh;
    margin: 10% 20% 0 20%;
    justify-content: center;
    padding-top: 5%;
    background-color: white;
    box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
  }
</style>