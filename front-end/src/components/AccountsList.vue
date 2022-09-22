<template>

  <h1>List component</h1>
    <div v-for="item in array">
      <Account :account="item"></Account>
    </div>


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

</style>