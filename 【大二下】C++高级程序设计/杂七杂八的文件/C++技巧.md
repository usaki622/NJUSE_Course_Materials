**输入数组问题**

问题描述：从控制台读入一个由N个实数构成的数组A。其中输入的第一个数字为数组A中的元素数量，以后 的数字为A中所有的元素，每个元素之间用空格隔开。 

解决：

```c++
int count;
cin >> count;
int *number_arr = new int[count];
for (int i = 0; i < count; i++) {
	cin >> number_arr[i];
}
```

**不使用string库分隔字符串**

问题描述：输入一系列坐标，

