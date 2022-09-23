<template>
  <main>
    <AccountsList :array="accounts"></AccountsList>
    <OpenButton></OpenButton>
  </main>
</template>


<script>

import OpenButton from "../components/OpenButton.vue"
import AccountsList from "../components/AccountsList.vue"

export default {
  components: {
    AccountsList,
    OpenButton
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

