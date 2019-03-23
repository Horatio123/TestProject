package com.baimahu;

import com.obs.services.ObsClient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String endPoint = "obs.cn-north-1.myhuaweicloud.com";
        String ak = "NE8CHGQ1IXV3NCYXHGCN";
        String sk = "MxzN6iwbiCQ8RoUmKCeuY4gmNHwxT1IEYmggDn4a";
// 创建ObsClient实例
        ObsClient obsClient = new ObsClient(ak, sk, endPoint);

// 使用访问OBS
        obsClient.createBucket("my-obs-bucket-demo-cyk-123");
        System.out.println(obsClient.headBucket("cyk1234"));
        System.out.println(obsClient.listBuckets().toString());

// 关闭obsClient
        //obsClient.close();
        System.out.println( "Hello World!" );
    }
}
