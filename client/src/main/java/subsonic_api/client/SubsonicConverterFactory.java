package subsonic_api.client;

import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;
import subsonic_api.model.License;
import subsonic_api.model.Response;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/**
 * Created by fxsalazar
 * 07/05/2017.
 */
public class SubsonicConverterFactory extends Converter.Factory {

    private SimpleXmlConverterFactory simpleXmlConverterFactory;

    private SubsonicConverterFactory(SimpleXmlConverterFactory simpleXmlConverterFactory) {
        this.simpleXmlConverterFactory = simpleXmlConverterFactory;
    }

    public static Converter.Factory create() {
        return new SubsonicConverterFactory(SimpleXmlConverterFactory.create());
    }

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(final Type type, Annotation[] annotations, final Retrofit retrofit) {
        final Converter<ResponseBody, Response> delegate = retrofit.nextResponseBodyConverter(this, Response.class, annotations);
        return new Converter<ResponseBody, Object>() {
            public Object convert(ResponseBody value) throws IOException {
                return castTypeObject(type, delegate.convert(value));
            }
        };
    }

    private License castTypeObject(Type type, Response response) {
        if (response.getResponse().getError() != null) {

        }
        return response.getResponse().getLicense();
    }
}
