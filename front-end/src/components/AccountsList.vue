<template>

  <h1>Alle users</h1>
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