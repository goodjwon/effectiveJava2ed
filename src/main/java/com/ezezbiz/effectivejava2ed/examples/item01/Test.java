package com.ezezbiz.effectivejava2ed.examples.item01;

public class Test {

    public static void main(String[] args) {
        Services.registerDefaultProvider(DEFAULT_PROVIDER);
        Services.registerProvider("comp", COMP_PROVIDER);
        Services.registerProvider("armed", ARMED_PROVIDER);

        // Clients would execute these lines
        Service s1 = Services.newInstance();
        Service s2 = Services.newInstance("comp");
        Service s3 = Services.newInstance("armed");
        System.out.printf("%s, %s, %s%n", s1, s2, s3);

    }

    public static Provider DEFAULT_PROVIDER = new Provider() {
        @Override
        public Service newService() {
            return new Service() {
                @Override
                public String toString() {
                    return "Default service";
                }
            };
        }
    };


    public static Provider COMP_PROVIDER = new Provider() {
        @Override
        public Service newService() {
            return new Service() {
                @Override
                public String toString() {
                    return "Default service";
                }
            };
        }
    };


    public static Provider ARMED_PROVIDER = new Provider() {
        @Override
        public Service newService() {
            return new Service() {
                @Override
                public String toString() {
                    return "Default service";
                }
            };
        }
    };
}
