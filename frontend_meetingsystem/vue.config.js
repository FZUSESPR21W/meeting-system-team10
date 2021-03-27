
module.exports = {
  devServer: {
    /* 自动打开浏览器 */
    open: false,
    // host: "192.168.0.137",
    // host: '192.168.1.137',
    port: 8080,
    https: false,
    hotOnly: false,
    /* 使用代理 */
    proxy: {
      '/foo': {
        target: 'http://120.26.60.194',
        changeOrigin: true,
        ws: true,
        pathRewrite: {
          '^/foo': ''
        }
      }
    },
    before: () => {}
  },
  // 第三方插件配置
  pluginOptions: {}
}
