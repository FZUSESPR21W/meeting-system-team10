<template>
  <div id="main_frame">
    <div id="frame_logo">
      <img src="../assets/logo.png" alt="logo">
    </div>
    <div id="dropdown">
      <Dropdown>
        <a href="javascript:void(0)">
          <div class="change_language">
            <div>{{current}}</div>
          </div>
        </a>
        <DropdownMenu slot="list">
          <DropdownItem v-for="(item, index) in nationName" :key="index" >
            <div class="change_language" @click="changeCurrent(item, index)">
              <div>{{item}}</div>
            </div>
          </DropdownItem>
        </DropdownMenu>
      </Dropdown>
    </div>
  </div>
</template>

<script>
export default {
  name: 'mainFrame.vue',
  data () {
    return {
      nationName: ['中国', 'La France', 'Deutschland', 'にほん', 'English'],
      nationCode: ['zh_cn', 'fr_FR', 'de_DE', 'ja_JP', 'en'],
      current: '中国'
    }
  },
  methods: {
    changeCurrent (item, index) {
      this.current = item
      this.$i18n.locale = this.nationCode[index]
    }
  }
}
</script>

<style scoped lang="less">

#main_frame {
  width: 100%;
  background-color: #2a4766;
  height: 50px;
  position: relative;
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
}

#frame_logo {

  >img{
    height: 40px;
    position: absolute;
    left: 10px;
    top: 50%;
    margin-top: -20px;
  }
}
#dropdown{
  position: relative;
  right: 20px;
}
.change_language {
  /*position: absolute;*/
  /*right: 0;*/
  /*top: 50%;*/
  /*margin-top: -15px;*/
  /*margin-right: 30px;*/
  /*height: 30px;*/
  /*filter: drop-shadow(2px 5px 3px #313131);*/
  /*cursor: pointer;*/
  /*transition: transform .3s ease-in-out, box-shadow .3s cubic-bezier(.47, 0, .745, .715), border .3s linear .1s;*/
  display: flex;
  flex-direction: row;
  justify-content: flex-end;
  align-items: center;
  width: 80px;
}

.change_language:hover{
  -webkit-transform: translateY(-5px);
  -moz-transform: translateY(-5px);
  transform: translateY(-5px)
}

</style>
