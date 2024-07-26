//Класс "Горячие Напитки Автомат"

public class HotDrinkMachine implements TradeMachine { //Реализация интерфейса "Торговый Автомат"
    @Override //применяется метод ООП "полиморфизм"

    public HotDrink getProduct(String name, int volume) {
        return new HotDrink(name, volume);
    }

    public HotDrinkWithTemperature getProduct(String name, int volume, int temperature) { //Перегруженный метод
        return new HotDrinkWithTemperature(name, volume, temperature);
    }
}
