package com.ezezbiz.effectivejava2ed.examples.item02.builder;

public class MemberBuilder {

    private final String name; //mandatory
    private final String email; //mandatory
    private String mobile; //optional
    private String address; //optional
    private String password; //optional
    private String state; //optional
    private int age; //optional

    private MemberBuilder(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static MemberBuilder aMember(String name, String email){
        return new MemberBuilder(name, email);
    }

    public MemberBuilder withMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public MemberBuilder withAddress(String address) {
        this.address = address;
        return this;
    }
    public MemberBuilder withPassword(String password) {
        this.password = password;
        return this;
    }
    public MemberBuilder withState(String state) {
        this.state = state;
        return this;
    }
    public MemberBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public Member build() {
        Member member = new Member();
        member.setName(name);
        member.setEmail(email);
        member.setMobile(mobile);
        member.setAddress(address);
        member.setPassword(password);
        member.setState(state);
        member.setAge(age);
        return member;
    }

    public static void main(String[] args) {
        Member member = MemberBuilder
                .aMember("Yun", "cheese10yun@gmail.com")
                .withAddress("address")
                .withAge(20)
                .withMobile("010-XXXX-XXXX")
                .build();
    }
}
