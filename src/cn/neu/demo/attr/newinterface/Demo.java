package cn.neu.demo.attr.newinterface;

import java.util.function.Supplier;

interface IService {
    default String retMsg() {
        return "Default implementation";
    }
}

interface ServiceFactory {
    static IService create(Supplier<IService> supplier) {
        return supplier.get();
    }
}

class ServiceImpl implements IService {
}

class ServiceImpl2 implements IService {
    @Override
    public String retMsg() {
        return "Overridden implementation";
    }
}

public class Demo {

    public static void main(String[] args) {
        IService id = ServiceFactory.create(ServiceImpl::new);
        System.out.println(id.retMsg());
        id = ServiceFactory.create(ServiceImpl2::new);
        System.out.println(id.retMsg());
    }
}
