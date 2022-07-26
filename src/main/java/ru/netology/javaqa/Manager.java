package ru.netology.javaqa;

public class Manager {

    private int quantityOfAddedMovies = 10; // Вводим переменную для дальнейшего ограничения вывода количества фильмов По умолчанию
    private String[] movies = new String[0];

    public void addMovies(String movie) { // метод для добавления фильмов в массив
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Manager(int quantityOfAddedMovies) { // ограничение вывода фильмов по дефолту
        this.quantityOfAddedMovies = quantityOfAddedMovies;

    }

    public Manager() {
    }//для установки своего ограничения вывода фильмов

    public String[] findAll() { // вывод ВСЕХ добавленых фильмов. Вообще всех
        return movies;
    }

    public String[] findLast() { // Метод для вывода последних добавленых фильмов (по дефолту или по указаному в ручную ограничению)
        int resultLength; // вводим переменную для длинны нового массива
        if (movies.length < quantityOfAddedMovies) { // говорим, что если длинна старого массива меньше ограничения вывода(по дефолту или заданного вручную),
            resultLength = movies.length;// то приравниваем длинну нового массива к старому,
        } else {
            resultLength = quantityOfAddedMovies;// в противном случае длинна нового массива ограничивается лимитом.
        }
        String[] newList = new String[resultLength]; // Задаем новый массив, длинна которого теперь зависит от нашего ограничения (по дефолту или в ручную).
        for (int i = 0; i < newList.length; i++) { // Для элементов по всей длинне массива
            newList[i] = movies[movies.length - i - 1]; // выполняется условие, что элементы нового массива, будут "перевернуты"-выведены в обратном порядке
        }
        return newList; // возвращаем набор элементов в обратном порядке в соответствии с ограничениями
    }


}