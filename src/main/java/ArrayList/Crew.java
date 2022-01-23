package ArrayList;

public class Crew<T> implements MyArrayList {
    private static final int DEFAULT_SIZE = 10;
    private T[] student;
    private int size;

    public Crew() {
        this.student = (T[]) new Object[DEFAULT_SIZE];
        this.size = 0;
    }

    /**
     * Добавляет нового интерна(студента) в конец списка (В случае успешного добавления выводит true иначе false)
     *
     * @param t добавляемый студент
     * @return
     */
    @Override
    public boolean add(Object t) {
        try {
            // если массив уже заполнен
            if (isFullArray()) {
                resize();
            }
            this.student[size] = (T) t;
            size++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Увеличивает размер массива до величины index (В случае успешного добавления выводит true иначе false)
     *
     * @param index размер массива
     * @return
     */

    @Override
    public boolean add(int index) {
        try {
            // если размер больше index то не увеличиваем
            if (size > index) return false;
            else
                this.size = index;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Метод меняет размер массива
     *
     * @Return
     */
    private void resize() {
        // запоминаем старый массив
        T[] oldElements = this.student;
        // создаем новый массив, который в полтора раза больше предыдущего
        this.student = (T[]) new Object[oldElements.length + oldElements.length / 2];
        // копируем все элементы из старого массива в новый
        for (int i = 0; i < size; i++) {
            this.student[i] = oldElements[i];
        }
    }

    /**
     * Метод проверяет массив на заполненность
     *
     * @Return
     */
    private boolean isFullArray() {
        return size == student.length;
    }

    /**
     * Получить студента по индексу
     *
     * @param index индекс искомого студента
     * @return студент под заданным индексом
     */
    @Override
    public T get(int index) {
        if (index >= 0 && index < size) {
            return student[index];
        }
        return null;
    }

    /**
     * Метод получает обьект из массива
     *
     * @Return
     */
    @Override
    public T get(Object o) {
        for (T t : student
        ) {
            if (t.equals(o))
                return t;
        }
        return null;
    }

    /**
     * Метод заменяет обьект в массиве по индексу
     *
     * @Return
     */
    @Override
    public void set(int index, Object o) {
        if (index >= 0 && index < size) {
            student[index] = (T) o;
        } else System.out.println("Нет такого элемента, который вы хотели заменить");
    }

    /**
     * Метод удаляет обьект из массива по индексу
     *
     * @Return
     */
    @Override
    public void remove(int index) {
        rangeCheck(index);
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(student, index + 1, student, index, numMoved);
        }
        student[--size] = null;

    }

    /**
     * Метод проверяет выход за размеры массива
     *
     * @Return
     */
    public void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Метод удаляет обьект из массива по обьекту
     *
     * @Return
     */
    @Override
    public void remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (((T) get(i)).equals((T) o)) {
                remove(i);
            }
        }
    }

    /**
     * Метод возвращает размер массива
     *
     * @Return size
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Пузырьковая сортировка
     */
    @Override
    public void sort() {
        for (int i = 0; i < this.size; ++i) {
            for (int j = i + 1; j < this.size; ++j) {
                if (((Comparable) this.get(i)).compareTo(((Comparable) this.get(j))) < 0) {
                    Comparable tempData = (Comparable) this.get(i);
                    this.set(i, this.get(j));
                    this.set(j, tempData);
                }

            }
        }
    }

    /**
     * Печать в консоль данных студента
     *
     * @param t - печатаемый студент
     */
    public void print(T t) {
        System.out.println(t.toString());
    }

    /**
     * Печать в консоль списка студентов
     *
     * @return
     */

    public void printAll() {
        for (int i = 0; i < size; ++i) {
            print((T) this.get(i));
        }
    }

    /**
     * Печатает в списке капитанов (у кого второй тест >= 60)
     *
     * @return
     */
    public void isCapitan() {

        int porog = 60;
        for (int i = 0; i < this.size; ++i) {
                if (((Intern) this.get(i)).getTest1() >= porog) System.out.println(this.get(i));
        }
    }


    /**
     * Метод очищает список
     *
     * @return
     */
    public void clean(){
        size = 0;
    }
}
