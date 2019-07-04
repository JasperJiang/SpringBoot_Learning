package com.jasper.springbootrest.http.conerter.properies;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractGenericHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Properties;

/**
 * {@link Properties} {@link AbstractGenericHttpMessageConverter} 实现
 */
public class PropertiesHttpMessageConverter extends AbstractGenericHttpMessageConverter<Properties> {

    //设置支持的MediaType
    public PropertiesHttpMessageConverter(){
        super(new MediaType("text", "properties"));
    }

    @Override
    protected void writeInternal(Properties properties, Type type, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        // Properties -> String
        // OutputStream -> Writer

        // 字节输出流
        OutputStream outputStream = httpOutputMessage.getBody();


        HttpHeaders httpHeaders = httpOutputMessage.getHeaders();
        MediaType mediaType = httpHeaders.getContentType();
        //获取字符编码
        Charset charset = mediaType.getCharset();
        charset = charset == null ? Charset.forName("UTF-8") : charset;
        // 字符输出流
        Writer writer = new OutputStreamWriter(outputStream, charset);

        properties.store(writer, "From PropertiesHttpMessageConverter");
    }

    @Override
    protected Properties readInternal(Class<? extends Properties> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {



        //字符流 -> 字符编码
        //从Content-Type解析编码
        HttpHeaders httpHeaders = httpInputMessage.getHeaders();
        MediaType mediaType = httpHeaders.getContentType();
        //获取字符编码
        Charset charset = mediaType.getCharset();
        charset = charset == null ? Charset.forName("UTF-8") : charset;

        // 字节流
        InputStream inputStream = httpInputMessage.getBody();
        InputStreamReader reader = new InputStreamReader(inputStream, charset);


        Properties properties = new Properties();
        properties.load(reader);

        return properties;
    }

    @Override
    public Properties read(Type type, Class<?> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        return readInternal(null, httpInputMessage);
    }
}
