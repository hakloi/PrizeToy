1) Используйте команды операционной системы Linux и создайте две новых директории – «Игрушки для школьников» и «Игрушки для дошколят»

>mkdir preschool_toys

>mkdir school_toys

>ls

2)   Создайте в директории «Игрушки для школьников» текстовые файлы - «Роботы», «Конструктор», «Настольные игры»

>cd preschool_toys

>echo >constructor.txt

>echo >boardgame.txt

>echo >robots.txt

>ls
3)    Создайте в директории «Игрушки для дошколят» текстовые файлы «Мягкие игрушки», «Куклы», «Машинки»
>cd school_toys

>echo >softtoys.txt

>echo >dolls.txt

>echo >cars.txt

>ls

4)   Объединить 2 директории в одну «Имя Игрушки»

> cd ..

> cp -RT school_toys/ preschool_toys/

> cd preschool_toys

> ls 

> cd ..

> rm -rf school_toys

5)   Переименовать директорию «Имя Игрушки» в «Игрушки»

> mv preschool toys 

6)   Просмотреть содержимое каталога «Игрушки».

>cd toys

> ls
7)   Установить и удалить snap-пакет. (Любой, какой хотите)
> snap find "music player"

> snap info clementine

> snap install clementine 

8)   Добавить произвольную задачу для выполнения каждые 3 минуты (Например, запись в текстовый файл чего-то или копирование из каталога А в каталог Б).

> */3 * * * * /scripts/test.sh

