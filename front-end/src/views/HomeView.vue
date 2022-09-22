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
    const HOST = "https://kalipo-prototype.herokuapp.com";

    fetch(`${HOST}/users`, {
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

