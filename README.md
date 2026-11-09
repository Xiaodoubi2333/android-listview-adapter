# android-listview-adapter v1.0

自定义 `ListView` 适配器的最小示例：用 `Fruit` 实体 + `FruitAdapter`（继承 `ArrayAdapter`）把带图标与文字的数据渲染成列表，并验证 `List<Fruit>` 能被适配器正常接管。

包名 `com.example.methodlistview`，`compileSdk 34 / minSdk 23`。

## 文件结构

```text
app/src/main/java/com/example/methodlistview/
├── MainActivity.java    组装 List<Fruit>，setAdapter
├── Fruit.java           列表项实体（名称 / 图片资源 id）
└── FruitAdapter.java    自定义 ArrayAdapter，内部 ViewHolder 复用
app/src/main/res/layout/
├── activity_main.xml    承载 ListView
└── fruit_item.xml       单行布局（ImageView + TextView）
```

## 启动

1. Android Studio 打开工程，同步 Gradle；
2. 运行 `app` 模块，列表直接显示内置的示例数据；
3. 无网络、无权限、无持久化。

依赖：`appcompat 1.0.2`、`constraintlayout 1.1.3`，全部为本地 `libs` + 官方基础库。

## 功能落点表

| # | 功能 | 状态 | 落点 |
|---|---|---|---|
| 1 | 自定义 `ArrayAdapter` | 完成 | `FruitAdapter.java` |
| 2 | 单行布局与视图复用 | 完成 | `fruit_item.xml` + `ViewHolder` |
| 3 | `List<Fruit>` 数据源绑定 | 完成 | `MainActivity` |
| 4 | 列表项点击事件 | 未实现 | 可在 `getView` 后追加 |
| 5 | 数据来源扩展（数据库 / 接口） | 未实现 | — |

## 版本记录

### v0.1 · 建库

- `chore: 初始化仓库（LICENSE / .gitignore）`：网页端建库。

### v0.2 · 空白列表

- `feat: 导入工程骨架`：工程首推。
- `feat: ListView 渲染空白行，逐行补注释定位`：列表能渲染但无数据，开始按行加注释排查。

### v1.0 · 适配器打通

- `feat: List<Fruit> 接入 ListView 与 FruitAdapter`：数据源与适配器对齐，并确认该模式可扩展 `weather_id`、`countyName` 等字段（后续天气项目的收藏列表即沿用此写法）。
- `fix: 修正条目绑定，列表稳定显示`：渲染稳定，注释补全。

## 已知限制

- 示例数据硬编码在 `MainActivity`，刷新需要重新进入页面。
