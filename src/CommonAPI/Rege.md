# 正则表达式

| 字符类（只匹配一个字符）                                      | 预定义字符（只匹配一个字符）                        |
|---------------------------------------------------|---------------------------------------|
| ```[abc]```只能是a\b\c其中之一                           | ```.```任何字符                           |
| ```[^abc]```除了a&b&c之外的字符                          | ```\d```一个数字，也就是```[0-9]```           |
| ```[a-zA-Z]```a到z或者A-Z都可以                         | ```\D```非数字，也就是```[^0-9]```           |
| ```[a-d[m-p]]```a到d或者m到p                          | ```\s```一个空白字符，也就是```[\t\n\x0B\\r]``` |
| ```[a-z&&[def]]```a-z和def的交集，即d\e\f               | ```\S```非空白字符，也就是```[^\s]```          |
| ```[a-z&&[^bc]]```a-z和bc补集的交集，等同于```[ad-z]```     | ```\w```  ```[a-zA-Z_0-9]```英文、数字、下划线 |
| ```[a-z&&[^m-p]]```a到z和除了m到p的交集，等同于```[a-lq-z]``` | ```\W``` ```[^\w]```一个非单词字符           |

