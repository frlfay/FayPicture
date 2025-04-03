<template>
  <a-page-header title="智能云图库使用指南" class="guide-container">
    <!-- 步骤条组件 -->
    <a-steps direction="vertical" :current="5">
      <!-- 功能概览 -->
      <a-step title="核心功能">
        <template #description>
          <div class="guide-content">
            <a-row :gutter="16">
              <a-col :span="12">
                <a-card title="公共图库" size="small">
                  <a-space direction="vertical">
                    <a-tag color="green">免费</a-tag>
                    <a-list size="small">
                      <a-list-item>• 浏览所有公开作品</a-list-item>
                      <a-list-item>• 下载/分享高清原图</a-list-item>
                      <a-list-item>• 以图搜图功能</a-list-item>
                      <a-list-item>• 支持AI扩展画幅</a-list-item>
                    </a-list>
                    <a-button
                      type="primary"
                      size="small"
                      block
                      @click="navigateTo('/add_picture')"
                    >
                      立即探索
                    </a-button>
                  </a-space>
                </a-card>
              </a-col>
              <a-col :span="12">
                <a-card title="私人空间" size="small">
                  <a-space direction="vertical">
                    <a-tag color="blue">专属</a-tag>
                    <a-list size="small">
                      <a-list-item>• 仅自己可见的图片</a-list-item>
                      <a-list-item>• 高级批量管理</a-list-item>
                      <a-list-item>• 多维智能搜索</a-list-item>
                      <a-list-item>• 打造个人相册/网盘</a-list-item>
                    </a-list>
                    <a-button
                      type="primary"
                      size="small"
                      block
                      @click="navigateTo('/my_space')"
                    >
                      进入空间
                    </a-button>
                  </a-space>
                </a-card>
              </a-col>
            </a-row>
          </div>
        </template>
      </a-step>

      <!--特色功能-->
      <a-step title="特色功能">
        <template #description>
          <div class="guide-content">
            <a-row :gutter="16">
              <a-col :span="8">
                <a-card hoverable size="small" title="以图搜图">
                  <a-typography-text type="secondary">上传图片查找相似作品</a-typography-text>
                </a-card>
              </a-col>
              <a-col :span="8">
                <a-card hoverable size="small" title="AI扩图">
                  <a-typography-text type="secondary">智能扩展图片画幅</a-typography-text>
                </a-card>
              </a-col>
              <a-col :span="8">
                <a-card hoverable size="small" title="批量编辑">
                  <a-typography-text type="secondary">同时修改多图元数据</a-typography-text>
                </a-card>
              </a-col>
            </a-row>
          </div>
        </template>
      </a-step>

      <!-- 上传流程 -->
      <a-step title="图片上传指南">
        <template #description>
          <div class="guide-content">
            <a-tabs>
              <a-tab-pane key="1" tab="公共图库上传">
                <a-space direction="vertical" size="middle">
                  <a-steps direction="vertical" size="small">
                    <a-step status="process" title="创建图片">
                      <template #description>
                        <div class="step-detail">
                          <a-space direction="vertical">
                            <a-typography-text type="secondary">支持拖拽或点击上传</a-typography-text>
                            <a-button
                              type="dashed"
                              size="small"
                              @click="navigateTo('/add_picture')"
                            >
                              上传图片
                            </a-button>
                          </a-space>
                        </div>
                      </template>
                    </a-step>
                    <a-step status="process" title="编辑处理（可选）">
                      <template #description>
                        <div class="step-detail">
                          <a-space>
                            <a-button size="small" :icon="h(EditOutlined)">编辑图片</a-button>
                            <a-button type="primary" size="small" :icon="h(FullscreenOutlined)">AI扩图</a-button>
                          </a-space>
                          <a-typography-text type="secondary" class="step-hint">
                            可调整图片尺寸、滤镜和画质
                          </a-typography-text>
                        </div>
                      </template>
                    </a-step>
                    <a-step status="process" title="填写信息（可选）">
                      <template #description>
                        <div class="step-detail">
                          <a-form layout="vertical" size="small" class="form-container">
                            <a-form-item label="标题">
                              <a-input placeholder="简洁描述作品内容"/>
                            </a-form-item>
                            <a-form-item label="简介">
                              <a-textarea
                                placeholder="详细描述作品背景、特点等"
                              />
                            </a-form-item>
                            <a-form-item label="分类">
                              <a-select
                                mode="tags"
                                placeholder="可自定义创建"
                                style="width: 100%"
                              />
                            </a-form-item>
                            <a-form-item label="标签">
                              <a-select
                                mode="tags"
                                placeholder="可自定义创建"
                                style="width: 100%"
                              />
                            </a-form-item>
                          </a-form>
                        </div>
                      </template>
                    </a-step>
                    <a-step status="wait" title="等待审核">
                      <template #description>
                        <div class="step-detail">
                          <a-alert
                            type="info"
                            message="管理员将在1-3工作日内完成审核"
                            show-icon
                          />
                          <a-typography-text type="secondary" class="step-hint">
                            审核通过后作品将展示在公共图库
                          </a-typography-text>
                        </div>
                      </template>
                    </a-step>
                  </a-steps>
                  <a-button
                    type="primary"
                    size="middle"
                    block
                    @click="navigateTo('/add_picture')"
                  >
                    开始上传图片
                  </a-button>
                </a-space>
              </a-tab-pane>

              <a-tab-pane key="2" tab="私人空间上传">
                <a-space direction="vertical" size="middle">
                  <a-alert
                    type="info"
                    message="上传流程与公共图库相同，但无需审核"
                    show-icon
                  />
                  <a-list size="small" bordered>
                    <a-list-item>
                      <template #actions>
                      </template>
                      <a-typography-text strong>批量操作：</a-typography-text>
                      支持同时编辑多张图片的元信息
                    </a-list-item>
                    <a-list-item>
                      <template #actions>
                      </template>
                      <a-typography-text strong>智能搜索：</a-typography-text>
                      可按颜色、尺寸、日期等多维度筛选
                    </a-list-item>
                    <a-list-item>
                      <template #actions>
                      </template>
                      <a-typography-text strong>空间分析：</a-typography-text>
                      可视化统计存储情况和内容分布
                    </a-list-item>
                  </a-list>
                  <a-button
                    type="primary"
                    size="middle"
                    block
                    @click="navigateTo('/my_space')"
                  >
                    前往私人空间上传
                  </a-button>
                </a-space>
              </a-tab-pane>
            </a-tabs>
          </div>
        </template>
      </a-step>

      <!-- 权限管理 -->
      <a-step title="权限说明">
        <template #description>
          <div class="guide-content">
            <a-table
              :columns="permissionColumns"
              :data-source="permissionData"
              size="small"
              :pagination="false"
              bordered
            >
              <template #bodyCell="{ column, record }">
                <template v-if="column.key === 'operation'">
                  <a-space>
                    <a-button
                      v-if="record.share"
                      type="primary"
                      size="small"
                    >
                      以图搜图
                    </a-button>
                    <a-button
                      v-if="record.share"
                      :icon="h(ShareAltOutlined)"
                      type="primary"
                      size="small"
                    >
                      分享
                    </a-button>
                    <a-button
                      v-if="record.share"
                      type="primary"
                      size="small"
                    >
                      免费下载
                    </a-button>
                    <a-button
                      v-if="record.edit"
                      :icon="h(EditOutlined)"
                      type="default"
                      size="small"
                    >
                      编辑
                    </a-button>
                    <a-button
                      v-if="record.delete"
                      :icon="h(DeleteOutlined)"
                      size="small"
                      danger
                    >
                      删除
                    </a-button>
                  </a-space>
                </template>
                <template v-else-if="column.key === 'access'">
                  <a-tag :color="record.public ? 'green' : 'blue'">
                    {{ record.public ? '公开' : '私有' }}
                  </a-tag>
                </template>
              </template>
            </a-table>
          </div>
        </template>
      </a-step>
    </a-steps>

    <!-- 技术支持 -->
    <a-divider />
    <div class="footer-actions">
      <a-button
        type="primary"
        @click="externalLink('https://fenlifang.top')"
      >
        联系我
      </a-button>
      <a-button
        type="link"
        @click="externalLink('https://github.com/frlfay/FayPicture')"
      >
        源码🔗GitHub
      </a-button>
    </div>
  </a-page-header>
</template>

<script setup>
import { useRouter } from 'vue-router'
import { h } from 'vue'
import {
  DeleteOutlined,
  DownloadOutlined,
  EditOutlined,
  FullscreenOutlined,
  ShareAltOutlined
} from '@ant-design/icons-vue'

const router = useRouter()

// 路由跳转
const navigateTo = (path) => {
  router.push(path)
}

// 外部链接跳转
const externalLink = (url) => {
  window.open(url, '_blank')
}

// 权限表格数据
const permissionColumns = [
  { title: '资源类型', dataIndex: 'type', key: 'type', width: '35%' },
  { title: '访问权限', key: 'access', width: '25%' },
  { title: '支持操作', key: 'operation', width: '40%' }
];

const permissionData = [
  {
    key: '1',
    type: '公共图库作品',
    public: true,
    edit: false,
    delete: false,
    share: true
  },
  {
    key: '2',
    type: '自己上传的公开作品',
    public: true,
    edit: true,
    delete: true,
    share: true
  },
  {
    key: '3',
    type: '私人空间作品',
    public: false,
    edit: true,
    delete: true,
    share: true
  }
];
</script>

<style scoped>
.guide-container {
  max-width: 1200px;
  margin: 0 auto;
  padding: 0 16px;
}

.guide-content {
  padding: 16px;
  background: #fafafa;
  border-radius: 8px;
  margin-bottom: 16px;
}

.step-detail {
  margin-top: 8px;
  padding-left: 16px;
}

.step-hint {
  display: block;
  margin-top: 8px;
  font-size: 12px;
}

.form-container {
  background: #fff;
  padding: 12px;
  border-radius: 4px;
  border: 1px solid #f0f0f0;
}

.footer-actions {
  text-align: center;
  margin-top: 24px;
}

:deep(.ant-steps-item-description) {
  min-height: 60px;
}

:deep(.ant-list-item) {
  padding: 8px 0;
}

/* 调整按钮内图标与文字的间距 */
:deep(.ant-btn .anticon + span) {
  margin-left: 4px; /* 调整为合适的间距 */
}
</style>
