package Test.juc;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class Cache{

    private Map map = new HashMap<>();

    private ReentrantReadWriteLock rwl=new ReentrantReadWriteLock();

    //存储

    public void put(String key,Integer value){
        rwl.writeLock().lock();
        try{
            System.out.println("线程"+Thread.currentThread().getName() + "===存储" + value);

            map.put(key,value);

            System.out.println("线程"+Thread.currentThread().getName() + "===已存储");
        }finally {
            rwl.writeLock().unlock();
        }

    }

    //读取

    public void get(String key) {
        rwl.readLock().lock();
        try {
            System.out.println("线程" + Thread.currentThread().getName() + "===读取");
            map.get(key);
            System.out.println("线程" + Thread.currentThread().getName() + "===已读取");
        }finally {
            rwl.readLock().unlock();
        }
    }}
    
    
    