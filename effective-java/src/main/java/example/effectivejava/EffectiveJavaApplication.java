package example.effectivejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EffectiveJavaApplication {

	public static void main(String[] args) {
	}

	public static class Users<T> {
		private final T name;

		public Users(T name) {
			this.name = name;
		}

		public T getName() {
			return name;
		}
	}
}
