<template>
  <div id="main_frame">
    <img id="frame_logo" src="../assets/logo.png" alt="logo">
    <svg class="icon" id="change_language" aria-hidden="true">
      <use xlink:href="#icon-flag-united-kingdom"></use>
    </svg>
  </div>
</template>

<script>
export default {
  name: 'mainFrame.vue'
}
</script>

<style scoped>

#main_frame {
  width: 100%;
  background-color: #2a4766;
  height: 50px;
  position: relative;
}

#frame_logo {
  height: 40px;
  position: absolute;
  left: 10px;
  top: 50%;
  margin-top: -20px;
}

#change_language {
  position: absolute;
  right: 0;
  top: 50%;
  margin-top: -15px;
  margin-right: 30px;
  height: 30px;
  filter: drop-shadow(2px 5px 3px #313131);
  cursor: pointer;
  transition: transform .3s ease-in-out, box-shadow .3s cubic-bezier(.47, 0, .745, .715), border .3s linear .1s;
}

#change_language:hover{
  -webkit-transform: translateY(-5px);
  -moz-transform: translateY(-5px);
  transform: translateY(-5px)
}

</style>
