import yt_dlp

def baixar_video_facebook(url):
    opcoes = {
        'outtmpl': '%(title)s.%(ext)s',  # Salva o vídeo com o título como nome
        'format': 'best',                # Baixa a melhor qualidade disponível
    }

    with yt_dlp.YoutubeDL(opcoes) as ydl:
        try:
            print(f"Baixando vídeo de: {url}")
            ydl.download([url])
            print("Download concluído com sucesso!")
        except Exception as e:
            print(f"Erro ao baixar o vídeo: {e}")

# Exemplo de uso
if __name__ == "__main__":
    url = input("Cole a URL do vídeo do Facebook: ")
    baixar_video_facebook(url)