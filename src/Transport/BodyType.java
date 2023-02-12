package Transport;

    public enum BodyType {SEDAN("Седан!"),
        HATCHBACK("Хетчбек!"),
        COUPE("Купе!"),
        STATION_WAGON("Универсал!"),
        SUV("Внедорожник!"),
        CROSSOVER("Кроссовер!"),
        PICKUP("Пикап!"),
        VAN("Фургон!"),
        MINIVAN("Минивэн!");

        private final String body;

        BodyType(String body) {
            this.body = body;
        }

        public String getBody() {
            return body;
        }
        public String toString() {
            return "Type{" +
                    "Тип кузова " + getBody() + '\'' +
                    '}';
        }

    }

