package net.xdclass.demo.utils;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * @PackageName: net.xdclass.demo.utils
 * @ClassName: Test
 * @Description:
 * @author: cxz
 * @date 2019/11/21 15:56
 */
public class Test {

    public static void main(String[] args){
        Base64.Encoder encoder = Base64.getEncoder();
        String str = "65203f0be9f2ed511b3cb201:4bd08c306b88a73b7b17ae57";
        System.out.println(encoder.encodeToString(str.getBytes()));
        Base64.Decoder decoder = Base64.getDecoder();
        try {
            System.out.println(new String(decoder.decode("YXBwS2V5OjRiZDA4YzMwNmI4OGE3M2I3YjE3YWU1Nw==".getBytes()), "GBK"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
