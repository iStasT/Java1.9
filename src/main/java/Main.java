public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Наташа";
        post.passport = "4443 № 44434443";
        post.surname = "Наташина";
        post.patronymic = "Ивановна";
        post.phone = "+7(900)-575-85-35";
        post.subscription = true;

        post.birthday = new FormData();
        post.birthday.day = 13;
        post.birthday.month = 03;
        post.birthday.year = 2023;
    }
}