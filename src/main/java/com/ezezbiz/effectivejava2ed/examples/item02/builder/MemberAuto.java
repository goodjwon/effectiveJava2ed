package com.ezezbiz.effectivejava2ed.examples.item02.builder;

public class MemberAuto {

    private String name; //mandatory
    private String email; //mandatory
    private String mobile; //optional
    private String address; //optional
    private String password; //optional
    private String state; //optional
    private int age; //optional


    public static final class MemberAutoBuilder {
        private String name; //mandatory
        private String email; //mandatory
        private String mobile; //optional
        private String address; //optional
        private String password; //optional
        private String state; //optional
        private int age; //optional

        private MemberAutoBuilder() {
        }

        public static MemberAutoBuilder aMemberAuto() {
            return new MemberAutoBuilder();
        }

        public MemberAutoBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public MemberAutoBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public MemberAutoBuilder withMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public MemberAutoBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public MemberAutoBuilder withPassword(String password) {
            this.password = password;
            return this;
        }

        public MemberAutoBuilder withState(String state) {
            this.state = state;
            return this;
        }

        public MemberAutoBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public MemberAuto build() {
            MemberAuto memberAuto = new MemberAuto();
            memberAuto.state = this.state;
            memberAuto.age = this.age;
            memberAuto.name = this.name;
            memberAuto.email = this.email;
            memberAuto.address = this.address;
            memberAuto.password = this.password;
            memberAuto.mobile = this.mobile;
            return memberAuto;
        }
    }

}
