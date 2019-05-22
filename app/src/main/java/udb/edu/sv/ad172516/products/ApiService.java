package udb.edu.sv.ad172516.products;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    //Get products
    @GET("Products.php")
    Call<List<Product>> getProducts();
}
