package example.effectivejava.item2;

public class BuilderPattern {

    public static class Users {
        private final int age;                 // 필수 기본값 없음
        private final String name;             // 필수 기본값 없음
        private final String nickname;         // 선택
        private final String phone_number;     // 선택
        private final String address;          // 선택



        private Users(Builder builder) {
            this.age = builder.age;
            this.name = builder.name;
            this.nickname = builder.nickname;
            this.phone_number = builder.phone_number;
            this.address = builder.address;
        }

        public static class Builder {
            // 필수 매개변수
            private final int age;
            private final String name;

            // 선택 매개변수 - 기본으로 초기화
            private String nickname = "Null";
            private String phone_number = "Null";
            private String address = "Null";

            public Builder(int age, String name) {
                this.age = age;
                this.name = name;
            }

            public Builder nickname(String nickname) {
                this.nickname = nickname;
                return this;
            }

            public Builder phone_number(String phone_number) {
                this.phone_number = phone_number;
                return this;
            }

            public Builder address(String address) {
                this.address = address;
                return this;
            }

            public Users build() {
                return new Users(this);
            }
        }
    }



    public static void main(String[] args) {
        Users user = new Users.Builder(26, "Jo")
                .nickname("jaeng2")
                .phone_number("010-4902")
                .address("Busan")
                .build();
    }
}
