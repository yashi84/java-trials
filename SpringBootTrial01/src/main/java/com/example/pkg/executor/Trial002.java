package com.example.pkg.executor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.List;

public class Trial002 {
    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("execute start.");
        new Trial002().execute();
        System.out.println("execute end.");
    }

    private void execute() throws JsonProcessingException {
        // execute logic here.

        // --- 配列 ---
        A[] array = { new A(1, "Alice"), new A(2, "Bob") };
        String arrayJson = JsonUtil.toJson(array);
        System.out.println("配列→JSON: " + arrayJson);
        A[] arrayRestored = JsonUtil.fromJsonToArray(arrayJson, A[].class);
        System.out.println("復元配列: " + Arrays.toString(arrayRestored));

        // --- List ---
        List<A> list = Arrays.asList(new A(3, "Carol"), new A(4, "Dave"));
        String listJson = JsonUtil.toJson(list);
        System.out.println("List→JSON: " + listJson);
        List<A> listRestored = JsonUtil.fromJsonToList(listJson);
//        List<A> listRestored = JsonUtil.fromJsonToList(listJson, A.class);
        System.out.println("復元List: " + listRestored);
    }

    static class A {
        private int id;
        private String name;

        public A() {}
        public A(int id, String name) {
            this.id = id; this.name = name;
        }

        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        @Override
        public String toString() {
            return "A!{id=" + id + ", name='" + name + "'}";
        }
    }

    static class JsonUtil {

        private static final ObjectMapper mapper = new ObjectMapper();

        /**
         * コレクションや配列を JSON 文字列に変換する
         */
        public static <T> String toJson(Object collection) throws JsonProcessingException {
            return mapper.writeValueAsString(collection);
        }

        /**
         * JSON を配列に変換
         */
        public static <T> T[] fromJsonToArray(String json, Class<T[]> clazz) throws JsonProcessingException {
            return mapper.readValue(json, clazz);
        }

        /**
         * JSON を List に変換
         */
        public static <T> List<T> fromJsonToList(String json, Class<T> clazz) throws JsonProcessingException {
            // List<T> のジェネリクス型情報は TypeReference で渡す必要がある
            return mapper.readValue(json, new TypeReference<List<T>>() {});
        }
        public static <T> List<T> fromJsonToList(String json) throws JsonProcessingException {
            // List<T> のジェネリクス型情報は TypeReference で渡す必要がある
            return mapper.readValue(json, new TypeReference<List<T>>() {});
        }
    }
}
