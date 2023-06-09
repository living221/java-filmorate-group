package ru.application.filmorate.storage;

import ru.application.filmorate.model.User;

import java.util.List;

public interface UserStorage {
    /**
     * Метод получения списка всех пользователей
     *
     * @return Список всех пользователей
     */
    List<User> get();

    /**
     * Метод получения пользователя по ID
     *
     * @param userId id пользователя
     * @return Объект пользователя
     */
    User get(Integer userId);

    /**
     * Метод создания пользователя
     *
     * @param user Принятый объект пользователя
     * @return созданный объект пользователя
     */
    User create(User user);

    /**
     * Метод изменения пользователя
     *
     * @param user Принятый объект пользователя
     * @return изменённый объект пользователя
     */
    User update(User user);

    /**
     * Метод удаления пользователя по ID
     *
     * @param id id пользователя
     */
    void remove(Integer id);

    /**
     * Метод проверки существоввания пользователя
     *
     * @param userId id пользователя
     * @return true пользователь существует, false пользователь не найден
     */
    Boolean isExist(Integer userId);
}
