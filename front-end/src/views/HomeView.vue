<template>
  <main>
    <AccountsList :array="accounts"></AccountsList>
  </main>
</template>


<script>
import AccountsList from "../components/AccountsList.vue"
export default {
  components: {
    AccountsList
  },

  created() {
    fetch("http://localhost:8080/users", {
      method: "GET"
    }).then(resp => resp.json())
    .then(data => {
      this.accounts = data;
    })
  },

  data() {
    return {
      accounts: []
    }
  },





}

</script>

