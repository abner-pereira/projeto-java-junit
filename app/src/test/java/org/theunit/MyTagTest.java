package org.theunit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

// Definição da Tag própria com inclusão de TESTE
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Tag(value = "MyTest")
@Test
public @interface MyTagTest {
	String autor();

	String data() default "01/06/2025";
}
