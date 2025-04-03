<template>
  <div id="basicLayout">
    <a-layout style="min-height: 100vh">
      <a-layout-header class="header">
        <GlobalHeader />
      </a-layout-header>
      <a-layout>
        <GlobalSider class="sider" />
        <a-layout-content class="content">
          <router-view />
          <!-- 将备案信息移到内容区域最下方 -->
          <div class="footer">
            <a href="https://beian.miit.gov.cn" target="_blank">粤ICP备2025394838号-1</a>
          </div>
        </a-layout-content>
      </a-layout>
    </a-layout>
  </div>
</template>

<script setup lang="ts">
import GlobalHeader from '@/components/GlobalHeader.vue'
import GlobalSider from "@/components/GlobalSider.vue";
</script>

<style scoped>
#basicLayout .header {
  padding-inline: 20px;
  background: white;
  color: unset;
  margin-bottom: 1px;
  box-shadow: 0 1px 4px rgba(0, 0, 0, 0.1);
}

#basicLayout .sider {
  background: #fff;
  border-right: 0.5px solid #eee;
  padding-top: 20px;
}

#basicLayout :deep(.ant-menu-root) {
  border-bottom: none !important;
  border-inline-end: none !important;
}

#basicLayout .content {
  padding: 28px;
  background: linear-gradient(to right, #fefefe, #fff);
  min-height: calc(100vh - 64px - 28px); /* 减去header和底部间距 */
  position: relative;
}

/* 备案信息样式 */
#basicLayout .footer {
  text-align: center;
  margin-top: 40px;
  color: #888;
  font-size: 12px;
  position: sticky;
  bottom: 0;
  background: rgba(255, 255, 255, 0.9);
  backdrop-filter: blur(2px);
  padding: 12px 0;
  z-index: 1;
}

#basicLayout .footer a {
  color: inherit;
  text-decoration: none;
  transition: color 0.3s;
}

#basicLayout .footer a:hover {
  color: #1890ff;
}
</style>
