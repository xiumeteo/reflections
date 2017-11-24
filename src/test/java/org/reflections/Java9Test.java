package org.reflections;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.reflections.util.ClasspathHelper;

import java.util.Set;

import static junit.framework.TestCase.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;

public class Java9Test {

    @Test
    public void test186() {
        Reflections reflections = new Reflections(ClasspathHelper.forClass(Object.class));
        Set<?> components = reflections.getSubTypesOf(Object.class);
        assertNotNull(components);
        assertThat(components.isEmpty(), CoreMatchers.is(false));
    }
}
