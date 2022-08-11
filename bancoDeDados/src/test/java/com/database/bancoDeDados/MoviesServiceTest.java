package com.database.bancoDeDados;

import com.database.bancoDeDados.models.MoviesModel;
import com.database.bancoDeDados.repositories.MoviesRepository;
import com.database.bancoDeDados.services.MoviesService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class MoviesServiceTest {

    @InjectMocks
    MoviesService moviesService;

    @Mock
    MoviesRepository moviesRepository;

    @Captor
    private ArgumentCaptor<MoviesModel> moviesCaptor;

    @Test
    public void deveCadastrarNoBancoDeDados(){
        MoviesModel moviesModel = new MoviesModel("Test", 120,"Action","Test");
        when(moviesRepository.save(moviesCaptor.capture())).thenReturn(moviesModel);
        moviesService.save(moviesModel);
        Assert.assertEquals(moviesModel, moviesCaptor.getValue());
    }
}
