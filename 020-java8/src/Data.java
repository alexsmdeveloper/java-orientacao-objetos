import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;

/**
 * 
 * Testando a nova API de datas do Java 8
 * 
 * @author Alex
 *
 */
public class Data {

	public static void main(String[] args) {

		/*
		 * Classe que representa uma !!data!! LocalDate IodaTime é uma API que não é do
		 * java (referente a datas) que fez tanto sucesso que a Oracle implementou algo
		 * parecido no java 8.
		 */
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate dataOlimpiadasMarte = LocalDate.of(2221, Month.NOVEMBER, 29);

		// Diferença de anos
		int diferencaAnosParaOlimpiadasMarte = dataOlimpiadasMarte.getYear() - hoje.getYear();
		System.out.println("Faltam " + diferencaAnosParaOlimpiadasMarte + " anos para as Olimpiadas de Marte.");
		// se você começar a fazer muitas contas de datas, pode ter a certeza que já tem
		// alguma
		// coisa pronta no java8 !!!!!

		// Intervalo de Datas (dia/mes/ano)
		Period periodoAteOlimpiadas = Period.between(hoje, dataOlimpiadasMarte);
		System.out.println(periodoAteOlimpiadas);
		System.out.println("periodoAteOlimpiadas.getDays()=" + periodoAteOlimpiadas.getDays());
		System.out.println("periodoAteOlimpiadas.getMonths()=" + periodoAteOlimpiadas.getMonths());
		System.out.println("periodoAteOlimpiadas.getYears()=" + periodoAteOlimpiadas.getYears());
		System.out.println("periodoAteOlimpiadas.get(ChronoUnit.YEARS)=" + periodoAteOlimpiadas.get(ChronoUnit.YEARS));

		// Período trabalha com dia, mes e anos
		List<TemporalUnit> unidadesSuportadas = periodoAteOlimpiadas.getUnits();
		unidadesSuportadas.forEach(unidade -> System.out.println(unidade));

		// não rolou, Period suporta a unidade semana. Se Period não suporta a unidade
		// semana,
		// quem suporta?
		// System.out.println("periodoAteOlimpiadas.get(ChronoUnit.WEEKS)="
		// + Long.valueOf(periodoAteOlimpiadas.get(ChronoUnit.WEEKS)));
		
		//Period Intervalo de horas

		// A API de datas é imutável
		// Para somar datas plus
		// Para subtrair datas minus
		LocalDate proximaOlimpiadas = dataOlimpiadasMarte.plusYears(4);
		System.out.println("Próxima Olimpiadas=" + proximaOlimpiadas);
		LocalDate anteriorOlimpiadas = dataOlimpiadasMarte.minusYears(4);
		System.out.println("Anterior Olimpiadas=" + anteriorOlimpiadas);

		// Para formatar datas
		DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada = proximaOlimpiadas.format(formatadorData);
		System.out.println("dataFormatada=" + dataFormatada);

		// LocalDateTime Representa uma data com hora e minutos
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatadorDataComHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		System.out.println("Data com Hora Formatada=" + agora.format(formatadorDataComHora));

		// Existem classes para trabalhar diretamente com ano
		Year ano = Year.of(1990);
		System.out.println("ano=" + ano);

		// Existem classes para trabalhar diretamente com ano
		YearMonth anoMes = YearMonth.of(1990, 6);
		DateTimeFormatter formatadorAnoMes = DateTimeFormatter.ofPattern("MM/yyyy");			
		System.out.println("anoMes=" + anoMes.format(formatadorAnoMes));
		
		//Representa uma hora
		LocalTime hora = LocalTime.of(13, 10);
		System.out.println(hora);		
		//hora. //tem vários métodos vemAntes, somar, subtrair...
		
		
		//ZonedDateTime
		ZonedDateTime dataHoraFusoHorario = ZonedDateTime.of(2020, 01, 12, 13, 16, 00, 00, ZoneOffset.of("-03:00"));		
		//DateTimeFormatter formatadorTimeZone = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss Z");
		DateTimeFormatter formatadorTimeZone = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss v");
		//DateTimeFormatter formatadorTimeZone = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss O");
		System.out.println(dataHoraFusoHorario.format(formatadorTimeZone));
		
		//Evite ficar fazendo contas, não reinvente a roda, utilize os recursos da API de data!

	}

}
