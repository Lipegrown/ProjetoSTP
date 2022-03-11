object Form4: TForm4
  Left = 0
  Top = 0
  Caption = 'Lan'#231'amento de Pagamento'
  ClientHeight = 278
  ClientWidth = 338
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -12
  Font.Name = 'Segoe UI'
  Font.Style = []
  PixelsPerInch = 96
  DesignSize = (
    338
    278)
  TextHeight = 15
  object Panel1: TPanel
    AlignWithMargins = True
    Left = 0
    Top = 0
    Width = 338
    Height = 278
    Anchors = [akLeft, akTop, akRight, akBottom]
    TabOrder = 0
    ExplicitWidth = 361
    ExplicitHeight = 337
    object Label1: TLabel
      Left = 16
      Top = 27
      Width = 69
      Height = 15
      Caption = 'F'#250'ncionario: '
    end
    object Label2: TLabel
      Left = 16
      Top = 67
      Width = 58
      Height = 15
      Caption = 'Valor Hora:'
    end
    object Label3: TLabel
      Left = 16
      Top = 115
      Width = 44
      Height = 15
      Caption = 'Periodo:'
    end
    object Label4: TLabel
      Left = 14
      Top = 161
      Width = 100
      Height = 15
      Caption = 'Horas Trabalhadas:'
    end
    object cbFuncionario: TComboBox
      Left = 120
      Top = 24
      Width = 201
      Height = 23
      TabOrder = 0
    end
    object edValorHora: TEdit
      Left = 120
      Top = 64
      Width = 105
      Height = 23
      TabOrder = 1
    end
    object edPeriodo: TEdit
      Left = 120
      Top = 112
      Width = 105
      Height = 23
      TabOrder = 2
    end
    object edHorasTrabalhadas: TEdit
      Left = 120
      Top = 158
      Width = 57
      Height = 23
      TabOrder = 3
    end
    object btVoltar: TButton
      Left = 16
      Top = 224
      Width = 75
      Height = 25
      Caption = 'Voltar'
      TabOrder = 4
    end
    object btLancar: TButton
      Left = 246
      Top = 224
      Width = 75
      Height = 25
      Caption = 'Lan'#231'ar'
      TabOrder = 5
    end
  end
end
