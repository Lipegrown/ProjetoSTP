object Form3: TForm3
  Left = 0
  Top = 0
  Caption = 'Cadastro de F'#250'ncionario'
  ClientHeight = 336
  ClientWidth = 446
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -12
  Font.Name = 'Segoe UI'
  Font.Style = []
  PixelsPerInch = 96
  DesignSize = (
    446
    336)
  TextHeight = 15
  object Panel1: TPanel
    AlignWithMargins = True
    Left = 0
    Top = 0
    Width = 444
    Height = 339
    Anchors = [akLeft, akTop, akRight, akBottom]
    TabOrder = 0
    ExplicitWidth = 609
    ExplicitHeight = 427
    object Label1: TLabel
      Left = 56
      Top = 43
      Width = 36
      Height = 15
      Caption = 'Nome:'
    end
    object Label2: TLabel
      Left = 56
      Top = 91
      Width = 24
      Height = 15
      Caption = 'CPF:'
    end
    object Label3: TLabel
      Left = 56
      Top = 139
      Width = 18
      Height = 15
      Caption = 'RG:'
    end
    object Label4: TLabel
      Left = 56
      Top = 188
      Width = 58
      Height = 15
      Caption = 'Valor Hora:'
    end
    object Button1: TButton
      Left = 56
      Top = 264
      Width = 75
      Height = 25
      Caption = 'Voltar'
      TabOrder = 0
    end
    object btCadastrar: TButton
      Left = 320
      Top = 264
      Width = 75
      Height = 25
      Caption = 'Cadastrar'
      TabOrder = 1
    end
    object Edit1: TEdit
      Left = 128
      Top = 40
      Width = 267
      Height = 23
      TabOrder = 2
    end
    object edCpf: TEdit
      Left = 128
      Top = 88
      Width = 177
      Height = 23
      TabOrder = 3
    end
    object edRg: TEdit
      Left = 128
      Top = 136
      Width = 177
      Height = 23
      TabOrder = 4
    end
    object edValorHora: TEdit
      Left = 128
      Top = 185
      Width = 89
      Height = 23
      TabOrder = 5
    end
  end
end
