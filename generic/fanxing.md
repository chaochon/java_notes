# 通配符

通配符用于类型变量的占位，主要有三种用法，例如
- `List<? extends A>` extends限定元素类型为A或者其子类，被称为上界通配符，被用于读取数据
- `List<?>` 表示不确定元素类型的列表，但应视为某种类型
- `List<? super A?` super限定元素类型为A或者其超类，被称为下界通配符，被用于写入数据

**类型变量通配符不能用于变量的类型声明或定义，常用于方法的形参声明**