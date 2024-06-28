package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle //deixar bonito
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App(){
    Column( // definindo a coluna
        Modifier //modificando os itens da coluna, o fundo e que vai ocupar tudo
            .fillMaxWidth() // ocupar a tela inteira

            .background(Color(0xFFF8F8F8)) //definindo a cor de fundo da coluna como preto
    ){

        // defininado as linhas da coluna
        Row( //primeira linha
            Modifier // Serve para modificar os itens da linha
                .fillMaxWidth() //ocupar a tela inteira
                // adicionando um padding
                .background(Color(0xFF46613C)), // definindo a cor de fundo


            Arrangement.Absolute.Center // deixar centralizado
        ){
            Text(

                text = "HIGH ECOLOGY",
                modifier = Modifier.padding(13.dp),
                style = TextStyle(
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    color = Color(0xFFF8F8F8)


                )
            ) // adicionando um texto

        }
        //Row( //linha para deixar um espaço
            //Modifier
             //   .padding(10.dp) // adicionando um padding
        //){}

       Column(
           Modifier
               .fillMaxWidth()
               .background(Color.White)

       ) {


       }
        Row(
            Modifier
                .fillMaxWidth(),

            Arrangement.Absolute.Center
        ){
            RoundedCardQuemSomos(
                modifier = Modifier.padding(10.dp),

                ) {
                Column(Modifier.padding(30.dp
                )) {
                    Text(text = "Quem somos?",

                        style = TextStyle(
                            fontFamily = FontFamily.Default,
                            fontWeight = FontWeight.Bold,
                            fontSize = 22.sp,
                            color = Color(0xFFF8F8F8)

                        )
                    )
                    Text(text = "Uma rede online de ensino focado em incentivar os nossos estudantes a cuidar melhor do lugar onde eles moram, a Terra. Temos o objetivo de disponibilizar cursos que abrangem as mais diversas matérias dos estudos ecológicos.",
                        modifier = Modifier.padding(10.dp),
                        style = TextStyle(

                            fontFamily = FontFamily.Default,

                            fontSize = 15.sp,
                            color = Color(0xFFF8F8F8)

                        )
                    )

                }
            }
        }
        Row(
            Modifier
                .fillMaxWidth(),

            Arrangement.Absolute.Center
        ){
        RoundedCard(
            modifier = Modifier.padding(10.dp),

            ) {
            Column(Modifier.padding(30.dp
            )) {
                Text(text = "ECOLOGIA",

                    style = TextStyle(
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    color = Color(0xFFF8F8F8)

                    )
                )
                Text(text = "O curso de Ecologia estuda interações ambientais, biodiversidade, conservação e ecossistemas, preparando para pesquisa e gestão ambiental",
                    modifier = Modifier.padding(10.dp),
                    style = TextStyle(

                        fontFamily = FontFamily.Default,

                        fontSize = 15.sp,
                        color = Color(0xFFF8F8F8)

                    )
                )
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier.width(200.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFF8F8F8)
                    )
                ) {//adicionando um botão na linha
                    Text(text = "Visualizar",
                        style = TextStyle(
                            fontFamily = FontFamily.Default,
                            fontSize = 17.sp,
                            color = Color.Black

                        )
                    )
                }
            }
        }
        }

        Row(
            Modifier
                .fillMaxWidth(),

            Arrangement.Absolute.Center
        ){
            RoundedCardOceanografia(
                modifier = Modifier.padding(start = 10.dp, top = 10.dp, end = 10.dp, bottom = 29.dp),

                ) {
                Column(Modifier.padding(30.dp
                )) {
                    Text(text = "OCEANOGRAFIA",

                        style = TextStyle(
                            fontFamily = FontFamily.Default,
                            fontWeight = FontWeight.Bold,
                            fontSize = 22.sp,
                            color = Color(0xFFF8F8F8)

                        )
                    )
                    Text(text = "O curso de Oceanografia estuda os oceanos, vida marinha e clima, preparando para pesquisa e conservação.",
                        modifier = Modifier.padding(10.dp),
                        style = TextStyle(

                            fontFamily = FontFamily.Default,

                            fontSize = 15.sp,
                            color = Color(0xFFF8F8F8)

                        )
                    )
                    Button(onClick = { /*TODO*/ },
                        modifier = Modifier.width(200.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFF8F8F8)
                        )
                    ) {//adicionando um botão na linha
                        Text(text = "Visualizar",
                            style = TextStyle(
                                fontFamily = FontFamily.Default,
                                fontSize = 17.sp,
                                color = Color.Black

                            )
                        )
                    }
                }
            }
        }
        Row(
            Modifier
                .fillMaxWidth(),

            Arrangement.Absolute.Center
        ){
            RoundedCard(


                ) {
                Row(Modifier.padding(start = 25.dp, top = 8.dp, end = 25.dp, bottom = 8.dp)) {
                    Button(onClick = { /*TODO*/ },
                        modifier = Modifier.width(100.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFF8F8F8)
                        )
                    ) {//adicionando um botão na linha
                        Text(text = "Home",
                            style = TextStyle(
                                fontFamily = FontFamily.Default,
                                fontSize = 17.sp,
                                color = Color.Black

                            )
                        )
                    }
                    Text(

                        text = " ",

                        style = TextStyle(
                            fontFamily = FontFamily.Default,
                            fontWeight = FontWeight.Bold,
                            fontSize = 22.sp,
                            color = Color(0xFFF8F8F8)


                        )
                    )
                    Button(onClick = { /*TODO*/ },
                        modifier = Modifier.width(120.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFF8F8F8)
                        )
                    ) {//adicionando um botão na linha
                        Text(text = "Cursos",
                            style = TextStyle(
                                fontFamily = FontFamily.Default,
                                fontSize = 17.sp,
                                color = Color.Black

                            )
                        )
                    }
                    Text(

                        text = " ",

                        style = TextStyle(
                            fontFamily = FontFamily.Default,
                            fontWeight = FontWeight.Bold,
                            fontSize = 22.sp,
                            color = Color(0xFFF8F8F8)


                        )
                    )
                    Button(onClick = { /*TODO*/ },

                        modifier = Modifier.width(90.dp),


                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFF8F8F8)
                        )
                    ) {//adicionando um botão na linha
                        Text(text = "Login",
                            style = TextStyle(
                                fontFamily = FontFamily.Default,
                                fontSize = 17.sp,
                                color = Color.Black

                            )
                        )
                    }
                }
            }
        }


    }
}
@Composable
fun RoundedCard(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Surface(
        modifier = modifier,
        shape = MaterialTheme.shapes.medium, // Define o shape como médio (arredondado)
        color = Color(0xFF46613C),

        ) {
        content()
    }
}
@Composable
fun RoundedCardQuemSomos(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Surface(
        modifier = modifier,
        shape = MaterialTheme.shapes.medium, // Define o shape como médio (arredondado)
        color = Color(0xFF3F1B0C),

        ) {
        content()
    }
}
@Composable
fun RoundedCardOceanografia(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Surface(
        modifier = modifier,
        shape = MaterialTheme.shapes.medium, // Define o shape como médio (arredondado)
        color = Color(0xFF1D6891),

        ) {
        content()
    }
}
@Composable
@Preview
fun AppPreview(){
    App()
    MyApplicationTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            App()
        }
    }
}