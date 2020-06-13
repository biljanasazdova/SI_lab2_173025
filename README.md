*Втора лабораториска вежба по Софтверско инженерство

*Билјана Саздова, бр. на индекс 173025

Група на код:
Ја добив групата на код 4

Control Flow Graph
![CFG](/SI_lab2_173025/CFG_173025.jpg)

Цикломатска комплексност

Цикломатската комплексност на овој код е 8. 
Истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. 
Во случајoв P=7, па цикломатската комплексност изнесува 8.
Проверка направив и со формулата за јазли и ребра, од таму 28ребра-22јазли+2=8, а исто така имаме и 8региони.

Тест случаи според критериумот Every statement и Every Branch criterium	

1.User=null	
2.user.username=null, user.password=null
3.user.username=Biljana,user.password=bile	
4.user.username=Biljana,user.pasword=biljanaa	
5.user.username=Biljana,user.password=biljana1	
6.user.username=Biljana,user.password=Biljana1	
7.user.username=Biljana,user.password=Biljana1!	

##Објаснување на напишаните unit tests
1.Доколку нема иницијализирано корисник,if условот е false и програмата завршува.
2.Доколку има иницијализирано корисник, но нема поставено име и лозинка, програмата повторно оди на false и завршува.
3.Со поставено корисничко име, но со лозинка пократка од 8карактери, функцијата повторно ке врати false и програмата ќе заврши.
4.Ја запазуваме должината на лозинката, но функцијата ни враќа false при проверка дали имаме цифра, голема буква и специјален карактер.
5.Сега во лозинката имаме и цифра, но при проверка за голема буква и специјален карактер, не е исполнет условот, функцијата враќа false.
6.Внесовме и голема буква и цифра, но кога проверуваме за специјален карактер, условот не е исполнет, повторно функцијата враќа false и програмата завршува.
7.При внес на лозинка што ги задоволува сите услови, функцијата враќа true.
